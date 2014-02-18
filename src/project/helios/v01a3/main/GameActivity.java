package project.helios.v01a3.main;

import project.helios.v01a3.R;
import project.helios.v01a3.framework.main.Game;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;


public class GameActivity extends Activity implements Game
{
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    
    setContentView(R.layout.game_activity);
  }
  
  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // getMenuInflater().inflate(R.menu.game, menu);
    return true;
  }
  
  @Override
  public boolean onStart()
  {
  
  }
  
  @Override
  public boolean onPause()
  {
  
  }
  
  @Override
  public boolean onResume()
  {
    
  }
  
  @Override
  public boolean onDestroy()
  {
  
  }
  
  public void doSomethingElse() 
  {
    
  }
}

