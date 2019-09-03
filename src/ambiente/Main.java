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

package ambiente;

/**
 * @author foletto.neo
 *
 */
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Cozinha c = new Cozinha();
    Banheiro b = new Banheiro();
    Quarto q = new Quarto();
    Sala s = new Sala();
    //
    c.setMicroondas(true);
    c.setArea(10);
    //
    b.setBanheira(true);
    b.setArea(21);
    //
    q.setCapacidade(20);
    q.setArea(333);
    //
    s.setTv(true);
    s.setArea(111);
    //
    System.out.println(c);
    System.out.println(b);
    System.out.println(q);
    System.out.println(s);
  }

}
