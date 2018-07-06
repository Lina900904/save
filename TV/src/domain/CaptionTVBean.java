package domain;

public class CaptionTVBean extends TVBean{
	private  String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "CaptionTvlBean [text=" + text + ", Power=" + Power + ", Channel=" + Channel + "]";
	}
}
