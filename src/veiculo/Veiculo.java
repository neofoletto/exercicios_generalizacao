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
public class Veiculo {

  private boolean motor;

  /**
   * @return the motor
   */
  public boolean isMotor() {
    return motor;
  }

  /**
   * @param motor the motor to set
   */
  public void setMotor(boolean motor) {
    if (motor)
      this.motor = motor;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Veiculo [motor=");
    builder.append(motor);
    builder.append("]");
    return builder.toString();
  }


}
