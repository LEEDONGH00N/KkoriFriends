package com.example.kkoriFriends.service;


import com.example.kkoriFriends.entity.Abandoned;
import com.example.kkoriFriends.model.abandonedDTO.AbandonedDTO;
import com.example.kkoriFriends.repository.AbandonedInfoRepository;
import com.google.gson.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ApiService {

    private final AbandonedInfoRepository abandonedInfoRepository;
    private final ModelMapper modelMapper;
    public List<AbandonedDTO> getApi(String apiUrl) throws IOException {

        URL url = new URL(apiUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestProperty("Content-type", "application/json");

        int responseCode = conn.getResponseCode();
        BufferedReader reader = new BufferedReader(new InputStreamReader(responseCode >= 200 && responseCode <= 300 ? conn.getInputStream() : conn.getErrorStream()));

        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }


        String jsonString = sb.toString();
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(jsonString, JsonObject.class);

        JsonArray abandonedStatusArray = jsonObject.getAsJsonArray("AbdmAnimalProtect");

        JsonObject abandonedStatusObject = abandonedStatusArray.get(1).getAsJsonObject(); // First object in the array
        JsonArray rowArray = abandonedStatusObject.getAsJsonArray("row");
        List<Abandoned> abandonedList = new ArrayList<>();
        for (JsonElement element : rowArray)
        {
            JsonObject rowObject = element.getAsJsonObject();
            Abandoned abandoned = gson.fromJson(rowObject, Abandoned.class);
            this.abandonedInfoRepository.save(abandoned);
            abandonedList.add(abandoned);
        }

        reader.close();
        conn.disconnect();
        return abandonedList.stream().map(a -> modelMapper.map(a, AbandonedDTO.class)).collect(Collectors.toList());
    }


}
