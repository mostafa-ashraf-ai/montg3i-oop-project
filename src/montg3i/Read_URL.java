
package montg3i;
import java.io.*;
import java.net.*;

/**
 *
 * @author Ahmed Eissa
 */
public class Read_URL {
    
    private static String getUrlContents(String theUrl)
  {
    StringBuilder content = new StringBuilder();
    try
    {
      URL url = new URL(theUrl);
      URLConnection urlConnection = url.openConnection();

      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

      String line;
      while ((line = bufferedReader.readLine()) != null)
      {
        content.append(line + "\n");
      }
      bufferedReader.close();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    return content.toString();
  }
}
    

