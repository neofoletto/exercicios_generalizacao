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
public class PessoaFisica extends Pessoa{

  private String cpf = "";
  private String estadoCivil = "";

  public PessoaFisica(){
    super();
  }

  public String getCpf() {
    return cpf;
  }

  public boolean setCpf(String cpf) {
    if (cpf.length() >= 11) {
      this.cpf = replaceCpf(cpf);
      return true;
    }
    return false;
  }

  public String getEstadoCivil() {
    return estadoCivil;
  }

  public boolean setEstadoCivil(String estadoCivil) {
    if (estadoCivil.length() != 0) {
      this.estadoCivil = estadoCivil;
      return true;
    }
    return false;
  }

  /**
   *
   * @param cpf : String -> Personal CPF
   * @return the CPF not formatted
   */
  private String replaceCpf(String cpf) {
    return cpf.replace(".", "")
        .replace(",", "")
        .replace("-", "")
        .replace("/", "");
  }

  /**
   *
   * @return the new format CPF
   */
  private String modifyCpf() {
    StringBuilder sb = new StringBuilder();
    sb.append(this.cpf.substring(0, 3)).append(".");
    sb.append(this.cpf.substring(3, 6)).append(".");
    sb.append(this.cpf.substring(6, 9)).append("-");
    sb.append(this.cpf.substring(9));
    return sb.toString();
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("\nPessoa Física\n");
    sb.append(super.toString());
    sb.append("CPF: ").append(modifyCpf()).append('\n');
    sb.append("Estado Civil: ").append(estadoCivil).append('\n');
    return sb.toString();
  }
}
