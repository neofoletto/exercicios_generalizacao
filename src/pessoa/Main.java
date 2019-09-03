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

package code.pessoa;

/**
 * @author neo
 * @create 02/09/2019
 */
public class Main {

  public static void main(String[] args) {
    PessoaFisica pf = new PessoaFisica();

    pf.setNome("Nome aqui");
    pf.setEndereco("Logo ali");
    pf.setCpf("999-999.999-99");
    pf.setEstadoCivil("SOlteiro");

    System.out.println(pf);
  }
}
