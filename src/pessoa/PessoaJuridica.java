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
public class PessoaJuridica extends Pessoa {

  private String cnpj;
  private String tipoEmpresa;

  public PessoaJuridica() {
  }

  public String getCnpj() {
    return cnpj;
  }

  public boolean setCnpj(String cnpj) {
    if (cnpj.length() == 14) {
      this.cnpj = cnpj;
      return true;
    }
    return false;
  }

  public String getTipoEmpresa() {
    return tipoEmpresa;
  }

  public boolean setTipoEmpresa(String tipoEmpresa) {
    if (tipoEmpresa.length() != 0) {
      this.tipoEmpresa = tipoEmpresa;
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("\nPessoa Jurídica\n");
    sb.append(super.toString());
    sb.append("CNPJ: ").append(cnpj).append('\n');
    sb.append("Tipo Empresa: ").append(tipoEmpresa).append('\n');
    return sb.toString();
  }
}
