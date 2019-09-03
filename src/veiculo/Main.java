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
package veiculo;

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
    Carro vc = new Carro();
    vc.setPortas(9);
    vc.setMotor(true);
    System.out.println(vc);
    //
    Caminhao vC = new Caminhao();
    vC.setEixos(8);
    vC.setMotor(false);
    System.out.println(vC);
    //
    Moto vm = new Moto();
    vm.setCilindradas(10);
    vm.setMotor(true);
    System.out.println(vm);
  }

}
