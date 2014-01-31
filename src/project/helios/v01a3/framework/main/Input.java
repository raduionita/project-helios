package project.helios.v01a3.framework.main;

import java.util.List;

public interface Input
{ 
  public static class KeyEvent
  {
    public final static int KEY_DOWN = 0;
    public final static int KEY_UP   = 0;
    
    public int type;
    public int keyCode;
    public int keyChar;
  }
  
  public static class TouchEvent
  {
    public final static int TOUCH_DOWN    = 0;
    public final static int TOUCH_UP      = 1;
    public final static int TOUCH_DRAGGED = 2;
    
    public int type;
    public int x;
    public int y;
    public int pointer;
  }
  
  public boolean isKeyPressed(final int keyCode);
  
  public boolean isTouchDown(final int pointer);
  
  public int getTouchX(final int pointer);
  
  public int getTouchY(final int pointer);
  
  public float getAccelX();
  
  public float getAccelY();
  
  public float getAccelZ();
  
  public List<KeyEvent> getKeyEvents();
  
  public List<TouchEvent> getTouchEvents();
}
