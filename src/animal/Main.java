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
package animal;

/**
 * @author foletto.neo
 *
 */
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Cao cao = new Cao();
    cao.setFalar("auaua");
    System.out.println(cao);
    //
    Gato gato = new Gato();
    gato.setFalar("Miau");
    System.out.println(gato);
    //
    Lagarto lagarto = new Lagarto();
    lagarto.setFalar("tart");
    System.out.println(lagarto);
    //
    Tartaruga tartaruga = new Tartaruga();
    tartaruga.setFalar("rarararar");
    System.out.println(tartaruga);
  }

}
