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

package bombaCombustivel;

/**
 * @author foletto.neo
 *
 */
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
    BombaGasolina bg = new BombaGasolina();
    bg.abastecerPorLitro(10);
    System.out.println(bg);
    //
    BombaEtanol be = new BombaEtanol();
    be.abastecerPorLitro(10);
    System.out.println(be);
    //
    BombaDisel bd = new BombaDisel();
    bd.abastecerPorLitro(213);
    System.out.println(bd);
  }

}
