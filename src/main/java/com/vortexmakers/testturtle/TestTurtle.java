/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vortexmakers.testturtle;

/**
 *
 * @author mrcto
 */

import ch.aplu.turtle.*;

public class  TestTurtle
{
  Turtle joe = new Turtle();

  public TestTurtle()
  {
    joe.forward(50);
    joe.right(90);
    joe.forward(50);    
  }

  public static void main(String[] args)
  {
    new TestTurtle();
  }
}
