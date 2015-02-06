package models;

public class Information {
	private Long infoId;
	private String date;
	private String content;
	private Long galleryId;
	private String group;
	private String heading;
	public Long getInfoId() {
		return infoId;
	}
	public void setInfoId(Long infoId) {
		this.infoId = infoId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Long getGalleryId() {
		return galleryId;
	}
	public void setGalleryId(Long galleryId) {
		this.galleryId = galleryId;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}

}
