/*
 *                     GNU GENERAL PUBLIC LICENSE
 *                        Version 3, 29 June 2007
 *
 *  Copyright (C) 2007 Free Software Foundation, Inc. <https://fsf.org/>
 *  Everyone is permitted to copy and distribute verbatim copies
 *  of this license document, but changing it is not allowed.
 *
 *                             Preamble
 *
 *   The GNU General Public License is a free, copyleft license for
 * software and other kinds of works.
 */

/**
 *
 */
package nave;

/**
 * @author foletto.neo
 *
 */
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    MillenniumFalcon m = new MillenniumFalcon();
    m.setClasseHiperpropulssor(1111);
    m.setVelocidadeMaxima(123123123);
    System.out.println(m);
    //
    Apolo11 a = new Apolo11();
    a.setTipoCombustivel("aaaaa");
    a.setVelocidadeMaxima(123123);
    System.out.println(a);
  }

}
