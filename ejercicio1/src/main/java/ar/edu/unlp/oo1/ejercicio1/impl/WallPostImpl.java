package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {
	private String texto = "Undefined post";
	private int likes = 0;
	private boolean destacada = false;

	public String getText() {
		return this.texto;
	}

	public int getLikes() {
		return this.likes;
	}

	public void setText(String texto) {
		this.texto = texto;
	}

	public void like() {
		this.likes += 1;
	}

	public void dislike() {
		if (this.likes > 0)
			this.likes -= 1;
	}

	public boolean isFeatured() {
		return this.destacada;
	}

	public void toggleFeatured() {
		this.destacada = !this.destacada;
	}

	@Override
	public String toString() {
		return "WallPost {" + "text: " + getText() + ", likes: '" + getLikes() + "'" + ", featured: '" + isFeatured()
				+ "'" + "}";
	}

}
