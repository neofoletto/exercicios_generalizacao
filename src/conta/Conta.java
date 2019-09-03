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
public class Conta {

  private String banco = "";
  private int agencia = 0;
  private int numeroConta = 0;
  private double saldo = 0;

  /**
   * @return the banco
   */
  public String getBanco() {
    return banco;
  }

  /**
   * @param banco the banco to set
   */
  public void setBanco(String banco) {
    if (banco.length() > 2)
      this.banco = banco;
  }

  /**
   * @return the agencia
   */
  public int getAgencia() {
    return agencia;
  }

  /**
   * @param agencia the agencia to set
   */
  public void setAgencia(int agencia) {
    if (agencia > 2)
      this.agencia = agencia;
  }

  /**
   * @return the numeroConta
   */
  public int getNumeroConta() {
    return numeroConta;
  }

  /**
   * @param numeroConta the numeroConta to set
   */
  public void setNumeroConta(int numeroConta) {
    if (numeroConta > 2)
      this.numeroConta = numeroConta;
  }

  /**
   * @return the saldo
   */
  public double getSaldo() {
    return saldo;
  }

  /**
   * @param valor the saldo to set
   * @return
   */
  public boolean deposito(double valor) {
    if (valor > 0) {
      this.saldo += valor;
      return true;
    } else
      return false;
  }

  public boolean saque(double valor) {
    if (valor <= this.saldo) {
      this.saldo -= valor;
      return true;
    } else
      return false;
  }

  /*
   * (non-Javadoc)
   *
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Conta [banco=");
    builder.append(banco);
    builder.append(", agencia=");
    builder.append(agencia);
    builder.append(", numeroConta=");
    builder.append(numeroConta);
    builder.append(", saldo=");
    builder.append(saldo);
    builder.append("]");
    return builder.toString();
  }

}
