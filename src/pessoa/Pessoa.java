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
public class Pessoa {

  private String nome;
  private String endereco;

  public Pessoa() {

  }

  public String getNome() {
    return nome;
  }

  public boolean setNome(String nome) {
    if (nome.length() > 2) {
      this.nome = nome;
      return true;
    }
    return false;
  }

  public String getEndereco() {
    return endereco;
  }

  public boolean setEndereco(String endereco) {
    if (endereco.length() != 0) {
      this.endereco = endereco;
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("Nome: ").append(nome).append('\n');
    sb.append("Endereco: '").append(endereco).append('\n');
    return sb.toString();
  }
}
