package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import static java.lang.Double.parseDouble;

public class JsonArrayParser {

    public ArrayList<CommandCode> parse(String path)
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        ArrayList<CommandCode> list = new ArrayList<>();


        //try (FileReader reader = new FileReader("C:\\Users\\janni\\Desktop\\Befehlscode.json"))
        try (FileReader reader = new FileReader(path))

        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            //System.out.println(obj);

            //JSONArray der einzelnen Commands
            JSONArray commandList = (JSONArray) obj;
            //System.out.println(commandList);


            for (int i = 0; i<commandList.size(); i++){
                CommandCode test = parseCommandObject((JSONObject) commandList.get(i));
                list.add(test);
                //System.out.println(list.get(i).getY());
            }



        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }

        return list;
    }

    private CommandCode parseCommandObject(JSONObject command)
    {
        double i = 0,j = 0,x = 0,y = 0;
        //Get commandObject within list
        JSONObject commandObject = (JSONObject) command.get("command");

        //Get command number
        String number = (String) commandObject.get("number");
        //System.out.println(number);

        //Get command code
        String code = (String) commandObject.get("code");
        //System.out.println(code);

        //Get commandObject from parameters
        JSONObject paramObj = (JSONObject) commandObject.get("parameters");
        //System.out.println(paramObj);

        //Check if x,y and i,j is set and apply values
        if (paramObj.get("x") != null && paramObj.get("y") != null){
            String xS = paramObj.get("x").toString();
            x = parseDouble(xS);
            String yS = paramObj.get("y").toString();
            y = parseDouble(yS);

            if (paramObj.get("i") != null && paramObj.get("j") != null){
                String iS = paramObj.get("i").toString();
                i = parseDouble(iS);
                String jS = paramObj.get("j").toString();
                j = parseDouble(jS);
            }
        }

        //generate a new CommandCode item with values to push to the Arraylist

        return new CommandCode(number, code,x,y,i,j);

    }

}
