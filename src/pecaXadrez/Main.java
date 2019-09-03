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

package pecaXadrez;

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
    Peao peao = new Peao();
    System.out.println("Peão");
    System.out.println(peao.mover(1, 2)); // linha - coluna
    System.out.println(peao.mover(0, 1));
    System.out.println(peao.mover(0, 2));
    //
    System.out.println();
    //
    Torre torre = new Torre();
    System.out.println("Torre");
    System.out.println(torre.mover(0, -1)); // linha - coluna
    System.out.println(torre.mover(0, 1));
    System.out.println(torre.mover(2, 1));
    //
    System.out.println();
    //
    Cavalo cavalo = new Cavalo();
    System.out.println("Cavalo");
    System.out.println(cavalo.mover(2, -1)); // linha - coluna
    System.out.println(cavalo.mover(2, 1));
    System.out.println(cavalo.mover(1, 2));
    //
    System.out.println();
    //
    Bispo bispo = new Bispo();
    System.out.println("Bispo");
    System.out.println(bispo.mover(2, 2)); // linha - coluna
    System.out.println(bispo.mover(4, 4));
    System.out.println(bispo.mover(1, 2));
    //
    System.out.println();
    //
    Rainha rainha = new Rainha();
    System.out.println("Rainha");
    System.out.println(rainha.mover(9, 2)); // linha - coluna
    System.out.println(rainha.mover(4, 4));
    System.out.println(rainha.mover(1, 2));
    //
    System.out.println();
    //
    Rei rei = new Rei();
    System.out.println("Rei");
    System.out.println(rei.mover(1, 1)); // linha - coluna
    System.out.println(rei.mover(1, 0));
    System.out.println(rei.mover(1, 2));
  }

}
