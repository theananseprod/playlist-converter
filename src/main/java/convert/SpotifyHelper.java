package convert;

import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.lang.StringBuffer;
import java.net.URL;

public class SpotifyHelper {

    private static HttpUrlConnection conn;
  // create a new playlist in the user's profile
  public void createPlaylist(String userId) {

      // handle POST method with body here. see docs here: https://developer.spotify.com/documentation/web-api/reference/#/operations/create-playlist
  }

  // search for the song in spotify's library
  public void findSong() {
      
      // handle GET method with query here. see docs here: https://developer.spotify.com/documentation/web-api/reference/#/operations/search
  }

  // add the song to created spotify playlist
  public void addSongToPlaylist() {

      // handle POST method with query and body here. see docs here: https://developer.spotify.com/documentation/web-api/reference/#/operations/add-tracks-to-playlist
  }
}