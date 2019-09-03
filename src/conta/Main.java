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
package conta;

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
    ContaSimples cs = new ContaSimples();
    cs.setAgencia(9999);
    cs.setBanco("abc");
    cs.setNumeroConta(1111);
    cs.deposito(900);
    cs.depositoPoupanca(1900);
    System.out.println(cs);
    cs.saque(200);
    cs.saquePoupanca(1000);
    System.out.println(cs);
    //
    ContaEspecial ce = new ContaEspecial();
    ce.setAgencia(8888);
    ce.setBanco("dse");
    ce.setNumeroConta(222);
    ce.deposito(700);
    ce.setLimie(3400);
    ce.setDiasDeJuros(15);
    System.out.println(ce);
    ce.saque(200);
    System.out.println(ce);
  }

}
