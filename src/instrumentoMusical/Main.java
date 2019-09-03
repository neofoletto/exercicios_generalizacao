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

package instrumentoMusical;

public class Main {

  public static void main(String[] args) {

    Piano p = new Piano("Black Piano", "Cassio", 0.6, 3, "Cauda");
    Violao violao = new Violao("azul", "lero", 10.0, 34);
    Prato prato = new Prato("azul", "bunda", "grande", 11, "La");
    Saxofone saxofone = new Saxofone("roxo", "bruna", "shoias", 133);
    Tuba tuba = new Tuba("marrom", "shu", "sdddd", 9, "Sol");
    Tambor tambor = new Tambor("amarelo", "zzz", "bruaaaaana", 11, "Do");
    //
    System.out.println(p);
    System.out.println(violao);
    System.out.println(prato);
    System.out.println(saxofone);
    System.out.println(tuba);
    System.out.println(tambor);
  }
}
