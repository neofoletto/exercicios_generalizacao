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
public class Pessoa {

  private int codigo = 0;
  private String nome = "";
  private String endereco = "";

  /**
   * @return the codigo
   */
  public int getCodigo() {
    return codigo;
  }

  /**
   * @param codigo the codigo to set
   */
  public void setCodigo(int codigo) {
    if (codigo > -1)
      this.codigo = codigo;
  }

  /**
   * @return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * @param nome the nome to set
   */
  public void setNome(String nome) {
    if (nome.length() > 2)
      this.nome = nome;
  }

  /**
   * @return the endereco
   */
  public String getEndereco() {
    return endereco;
  }

  /**
   * @param endereco the endereco to set
   */
  public void setEndereco(String endereco) {
    if (endereco.length() > 2)
      this.endereco = endereco;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Pessoa [codigo=");
    builder.append(codigo);
    builder.append(", nome=");
    builder.append(nome);
    builder.append(", endereco=");
    builder.append(endereco);
    builder.append("]");
    return builder.toString();
  }

}
