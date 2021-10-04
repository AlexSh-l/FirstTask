package com.alex.filereader;

import com.alex.constants.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersReader {

    private static final Logger logger = LogManager.getLogger();

    public List<String> readNumbers(){
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(Constants.filePath))) {
            list = bufferedReader.lines().collect(Collectors.toList());

        } catch (IOException e) {
            logger.error(e.getMessage());
        }
        return list;
    }

}
