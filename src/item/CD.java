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
public class CD extends Midia {

  private int faixa = 0;
  private String autor = "";
  private String album = "";

  /**
   * @return the faixa
   */
  public int getFaixa() {
    return faixa;
  }

  /**
   * @param faixa the faixa to set
   */
  public void setFaixa(int faixa) {
    if (faixa > 0)
      this.faixa = faixa;
  }

  /**
   * @return the autor
   */
  public String getAutor() {
    return autor;
  }

  /**
   * @param autor the autor to set
   */
  public void setAutor(String autor) {
    if (autor.length() != 0)
      this.autor = autor;
  }

  /**
   * @return the album
   */
  public String getAlbum() {
    return album;
  }

  /**
   * @param album the album to set
   */
  public void setAlbum(String album) {
    if (album.length() != 0)
      this.album = album;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("CD [faixa=");
    builder.append(faixa);
    builder.append(", autor=");
    builder.append(autor);
    builder.append(", toString()=");
    builder.append(super.toString());
    builder.append("]");
    return builder.toString();
  }

}
