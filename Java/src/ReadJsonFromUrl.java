// ReadJsonFromUrl
// Read JSON file from url and convert to object
//
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadJsonFromUrl {
    public static void ReadJsonFromUrl() {


        try {
            String urlString = "https://raw.githubusercontent.com/prust/wikipedia-movie-data/master/movies.json";
            URL url = new URL(urlString);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String data = reader.readLine();
            JSONArray jsonArr = new JSONArray(data);
            int i = 0;
            for (i = 0; i < 10; i++)
            {
                JSONObject jsonObj = jsonArr.getJSONObject(i);
                System.out.println("No."+(i+1)+" "+jsonObj.get("title"));
            }
            System.out.println("Count : "+jsonArr.length());
            reader.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }



    public static void main(String args[]){
        ReadJsonFromUrl();
    }
}
