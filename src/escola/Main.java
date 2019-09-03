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
package escola;

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
    Aluno a = new Aluno();
    a.setCodigo(123);
    a.setDisciplina("setDisciplina");
    a.setEndereco("setEndereco");
    a.setNome("setNome");
    System.out.println(a);
    //
    Professor p = new Professor();
    p.setCodigo(3333);
    p.setEndereco("AS");
    p.setMatricula(31111);
    p.setNome("ASASAS");
    System.out.println(p);

  }

}
