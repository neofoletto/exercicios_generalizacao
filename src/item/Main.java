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
package item;

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
    Livro l = new Livro();
    l.setAutor("Livro 01");
    l.setCodigo(123123);
    l.setDescricao("asohoiasdhoiad");
    System.out.println(l);
    //
    VHS v = new VHS();
    v.setTitulo("VHS");
    v.setGravadora("grav");
    v.setDuracao(10);
    v.setCodigo(222222);
    v.setDescricao("aaaaaa");
    System.out.println(v);
    //
    CD c = new CD();
    c.setFaixa(01);
    c.setAutor("CD");
    c.setAlbum("CApa");
    c.setGravadora("grav");
    c.setDuracao(10);
    c.setCodigo(222222);
    c.setDescricao("aaaaaa");
    System.out.println(c);
  }

}
