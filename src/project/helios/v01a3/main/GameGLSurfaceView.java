package project.helios.v01a3.main;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

public class GameGLSurfaceView extends GLSurfaceView
{
  public GameGLSurfaceView(Context context)
  {
    super(context);
  }
  
  public GameGLSurfaceView(Context context, AttributeSet attrs)
  {
    super(context, attrs);
  }
  
  public void setRenderer(GameRenderer renderer)
  {
    setRenderer(renderer);
  }
}
