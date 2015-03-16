/*
 * @author Ramesh Lingappa
 */
package com.jmandrillapi.model.message;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jmandrillapi.utils.ObjectUtils;

/**
 * The Class MandrillMessage.
 */
public class MandrillMessage {

	/** The subaccount. */
	private String html, text, subject, subaccount;

	/** The to. */
	private List<Recipient> to;

	/** The tags. */
	private List<String> tags;

	/** The metadata. */
	private Map<String, String> headers, metadata;

	/** The merge. */
	private boolean important, merge;

	/** The images. */
	private List<MessageAttachment> attachments, images;

	/** The from email. */
	@JsonProperty("from_email")
	private String fromEmail;

	/** The from name. */
	@JsonProperty("from_name")
	private String fromName;

	/** The track opens. */
	@JsonProperty("track_opens")
	private boolean trackOpens;

	/** The track clicks. */
	@JsonProperty("track_clicks")
	private boolean trackClicks;

	/** The auto text. */
	@JsonProperty("auto_text")
	private boolean autoText;

	/** The auto html. */
	@JsonProperty("auto_html")
	private boolean autoHtml;

	/** The inline css. */
	@JsonProperty("inline_css")
	private boolean inlineCss;

	/** The url strip qs. */
	@JsonProperty("url_strip_qs")
	private boolean urlStripQs;

	/** The preserve recipients. */
	@JsonProperty("preserve_recipients")
	private boolean preserveRecipients;

	/** The view content link. */
	@JsonProperty("view_content_link")
	private boolean viewContentLink;

	/** The bcc address. */
	@JsonProperty("bcc_address")
	private String bccAddress;

	/** The tracking domain. */
	@JsonProperty("tracking_domain")
	private String trackingDomain;

	/** The signing domain. */
	@JsonProperty("signing_domain")
	private String signingDomain;

	/** The return path domain. */
	@JsonProperty("return_path_domain")
	private String returnPathDomain;

	/** The merge language. */
	@JsonProperty("merge_language")
	private String mergeLanguage;

	/** The global merge vars. */
	@JsonProperty("global_merge_vars")
	private List<MergeVar> globalMergeVars;

	/** The merge vars. */
	@JsonProperty("merge_vars")
	private List<RecipientMergeVars> mergeVars;

	/** The google analytics domains. */
	@JsonProperty("google_analytics_domains")
	private List<String> googleAnalyticsDomains;

	/** The google analytics campaign. */
	@JsonProperty("google_analytics_campaign")
	private String googleAnalyticsCampaign;

	/** The recipient meta data. */
	@JsonProperty("recipient_metadata")
	private List<RecipientMetadata> recipientMetaData;

	/**
	 * Instantiates a new mandrill message.
	 */
	public MandrillMessage() {
	}

	/**
	 * Instantiates a new mandrill message.
	 *
	 * @param fromEmail the from email
	 * @param subject the subject
	 */
	public MandrillMessage(String fromEmail, String subject) {
		super();
		this.fromEmail = fromEmail;
		this.subject = subject;
	}

	/**
	 * Gets the html.
	 *
	 * @return the html
	 */
	public String getHtml() {
		return html;
	}

	/**
	 * Sets the html.
	 *
	 * @param html the new html
	 */
	public void setHtml(String html) {
		this.html = html;
	}

	/**
	 * Gets the text.
	 *
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * Sets the text.
	 *
	 * @param text the new text
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Gets the subject.
	 *
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * Sets the subject.
	 *
	 * @param subject the new subject
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * Gets the subaccount.
	 *
	 * @return the subaccount
	 */
	public String getSubaccount() {
		return subaccount;
	}

	/**
	 * Sets the subaccount.
	 *
	 * @param subaccount the new subaccount
	 */
	public void setSubaccount(String subaccount) {
		this.subaccount = subaccount;
	}

	/**
	 * Gets the to.
	 *
	 * @return the to
	 */
	public List<Recipient> getTo() {
		return to;
	}

	/**
	 * Sets the to.
	 *
	 * @param to the new to
	 */
	public void setTo(List<Recipient> to) {
		this.to = to;
	}

	/**
	 * Adds the to.
	 *
	 * @param recipient the recipient
	 */
	public void addTo(Recipient recipient) {
		this.to = ObjectUtils.addToList(to, recipient);
	}

	/**
	 * Gets the tags.
	 *
	 * @return the tags
	 */
	public List<String> getTags() {
		return tags;
	}

	/**
	 * Sets the tags.
	 *
	 * @param tags the new tags
	 */
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	/**
	 * Adds the tags.
	 *
	 * @param tag the tag
	 */
	public void addTags(String tag) {
		this.tags = ObjectUtils.addToList(tags, tag);
	}

	/**
	 * Gets the headers.
	 *
	 * @return the headers
	 */
	public Map<String, String> getHeaders() {
		return headers;
	}

	/**
	 * Sets the headers.
	 *
	 * @param headers the headers
	 */
	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}

	/**
	 * Adds the header.
	 *
	 * @param key the key
	 * @param value the value
	 */
	public void addHeader(String key, String value) {
		this.headers = ObjectUtils.addToMap(this.headers, key, value);
	}

	/**
	 * Gets the metadata.
	 *
	 * @return the metadata
	 */
	public Map<String, String> getMetadata() {
		return metadata;
	}

	/**
	 * Sets the metadata.
	 *
	 * @param metadata the metadata
	 */
	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}

	/**
	 * Adds the meta data.
	 *
	 * @param key the key
	 * @param value the value
	 */
	public void addMetaData(String key, String value) {
		this.metadata = ObjectUtils.addToMap(this.metadata, key, value);
	}

	/**
	 * Checks if is important.
	 *
	 * @return true, if is important
	 */
	public boolean isImportant() {
		return important;
	}

	/**
	 * Sets the important.
	 *
	 * @param important the new important
	 */
	public void setImportant(boolean important) {
		this.important = important;
	}

	/**
	 * Checks if is merge.
	 *
	 * @return true, if is merge
	 */
	public boolean isMerge() {
		return merge;
	}

	/**
	 * Sets the merge.
	 *
	 * @param merge the new merge
	 */
	public void setMerge(boolean merge) {
		this.merge = merge;
	}

	/**
	 * Gets the attachments.
	 *
	 * @return the attachments
	 */
	public List<MessageAttachment> getAttachments() {
		return attachments;
	}

	/**
	 * Sets the attachments.
	 *
	 * @param attachments the new attachments
	 */
	public void setAttachments(List<MessageAttachment> attachments) {
		this.attachments = attachments;
	}

	/**
	 * Adds the attachment.
	 *
	 * @param attachment the attachment
	 */
	public void addAttachment(MessageAttachment attachment) {
		this.attachments = ObjectUtils.addToList(this.attachments, attachment);
	}

	/**
	 * Gets the images.
	 *
	 * @return the images
	 */
	public List<MessageAttachment> getImages() {
		return images;
	}

	/**
	 * Sets the images.
	 *
	 * @param images the new images
	 */
	public void setImages(List<MessageAttachment> images) {
		this.images = images;
	}

	/**
	 * Adds the image.
	 *
	 * @param image the image
	 */
	public void addImage(MessageAttachment image) {
		this.images = ObjectUtils.addToList(this.images, image);
	}

	/**
	 * Gets the from email.
	 *
	 * @return the from email
	 */
	public String getFromEmail() {
		return fromEmail;
	}

	/**
	 * Sets the from email.
	 *
	 * @param fromEmail the new from email
	 */
	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	/**
	 * Gets the from name.
	 *
	 * @return the from name
	 */
	public String getFromName() {
		return fromName;
	}

	/**
	 * Sets the from name.
	 *
	 * @param fromName the new from name
	 */
	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	/**
	 * Checks if is track opens.
	 *
	 * @return true, if is track opens
	 */
	public boolean isTrackOpens() {
		return trackOpens;
	}

	/**
	 * Sets the track opens.
	 *
	 * @param trackOpens the new track opens
	 */
	public void setTrackOpens(boolean trackOpens) {
		this.trackOpens = trackOpens;
	}

	/**
	 * Checks if is track clicks.
	 *
	 * @return true, if is track clicks
	 */
	public boolean isTrackClicks() {
		return trackClicks;
	}

	/**
	 * Sets the track clicks.
	 *
	 * @param trackClicks the new track clicks
	 */
	public void setTrackClicks(boolean trackClicks) {
		this.trackClicks = trackClicks;
	}

	/**
	 * Checks if is auto text.
	 *
	 * @return true, if is auto text
	 */
	public boolean isAutoText() {
		return autoText;
	}

	/**
	 * Sets the auto text.
	 *
	 * @param autoText the new auto text
	 */
	public void setAutoText(boolean autoText) {
		this.autoText = autoText;
	}

	/**
	 * Checks if is auto html.
	 *
	 * @return true, if is auto html
	 */
	public boolean isAutoHtml() {
		return autoHtml;
	}

	/**
	 * Sets the auto html.
	 *
	 * @param autoHtml the new auto html
	 */
	public void setAutoHtml(boolean autoHtml) {
		this.autoHtml = autoHtml;
	}

	/**
	 * Checks if is inline css.
	 *
	 * @return true, if is inline css
	 */
	public boolean isInlineCss() {
		return inlineCss;
	}

	/**
	 * Sets the inline css.
	 *
	 * @param inlineCss the new inline css
	 */
	public void setInlineCss(boolean inlineCss) {
		this.inlineCss = inlineCss;
	}

	/**
	 * Checks if is url strip qs.
	 *
	 * @return true, if is url strip qs
	 */
	public boolean isUrlStripQs() {
		return urlStripQs;
	}

	/**
	 * Sets the url strip qs.
	 *
	 * @param urlStripQs the new url strip qs
	 */
	public void setUrlStripQs(boolean urlStripQs) {
		this.urlStripQs = urlStripQs;
	}

	/**
	 * Checks if is preserve recipients.
	 *
	 * @return true, if is preserve recipients
	 */
	public boolean isPreserveRecipients() {
		return preserveRecipients;
	}

	/**
	 * Sets the preserve recipients.
	 *
	 * @param preserveRecipients the new preserve recipients
	 */
	public void setPreserveRecipients(boolean preserveRecipients) {
		this.preserveRecipients = preserveRecipients;
	}

	/**
	 * Checks if is view content link.
	 *
	 * @return true, if is view content link
	 */
	public boolean isViewContentLink() {
		return viewContentLink;
	}

	/**
	 * Sets the view content link.
	 *
	 * @param viewContentLink the new view content link
	 */
	public void setViewContentLink(boolean viewContentLink) {
		this.viewContentLink = viewContentLink;
	}

	/**
	 * Gets the bcc address.
	 *
	 * @return the bcc address
	 */
	public String getBccAddress() {
		return bccAddress;
	}

	/**
	 * Sets the bcc address.
	 *
	 * @param bccAddress the new bcc address
	 */
	public void setBccAddress(String bccAddress) {
		this.bccAddress = bccAddress;
	}

	/**
	 * Gets the tracking domain.
	 *
	 * @return the tracking domain
	 */
	public String getTrackingDomain() {
		return trackingDomain;
	}

	/**
	 * Sets the tracking domain.
	 *
	 * @param trackingDomain the new tracking domain
	 */
	public void setTrackingDomain(String trackingDomain) {
		this.trackingDomain = trackingDomain;
	}

	/**
	 * Gets the signing domain.
	 *
	 * @return the signing domain
	 */
	public String getSigningDomain() {
		return signingDomain;
	}

	/**
	 * Sets the signing domain.
	 *
	 * @param signingDomain the new signing domain
	 */
	public void setSigningDomain(String signingDomain) {
		this.signingDomain = signingDomain;
	}

	/**
	 * Gets the return path domain.
	 *
	 * @return the return path domain
	 */
	public String getReturnPathDomain() {
		return returnPathDomain;
	}

	/**
	 * Sets the return path domain.
	 *
	 * @param returnPathDomain the new return path domain
	 */
	public void setReturnPathDomain(String returnPathDomain) {
		this.returnPathDomain = returnPathDomain;
	}

	/**
	 * Gets the merge language.
	 *
	 * @return the merge language
	 */
	public String getMergeLanguage() {
		return mergeLanguage;
	}

	/**
	 * Sets the merge language.
	 *
	 * @param mergeLanguage the new merge language
	 */
	public void setMergeLanguage(String mergeLanguage) {
		this.mergeLanguage = mergeLanguage;
	}

	/**
	 * Gets the global merge vars.
	 *
	 * @return the global merge vars
	 */
	public List<MergeVar> getGlobalMergeVars() {
		return globalMergeVars;
	}

	/**
	 * Sets the global merge vars.
	 *
	 * @param globalMergeVars the new global merge vars
	 */
	public void setGlobalMergeVars(List<MergeVar> globalMergeVars) {
		this.globalMergeVars = globalMergeVars;
	}

	/**
	 * Adds the global merge var.
	 *
	 * @param var the var
	 */
	public void addGlobalMergeVar(MergeVar var) {
		this.globalMergeVars = ObjectUtils.addToList(this.globalMergeVars, var);
	}

	/**
	 * Gets the merge vars.
	 *
	 * @return the merge vars
	 */
	public List<RecipientMergeVars> getMergeVars() {
		return mergeVars;
	}

	/**
	 * Sets the merge vars.
	 *
	 * @param mergeVars the new merge vars
	 */
	public void setMergeVars(List<RecipientMergeVars> mergeVars) {
		this.mergeVars = mergeVars;
	}

	/**
	 * Adds the merge var.
	 *
	 * @param mergeVar the merge var
	 */
	public void addMergeVar(RecipientMergeVars mergeVar) {
		this.mergeVars = ObjectUtils.addToList(this.mergeVars, mergeVar);
	}

	/**
	 * Gets the google analytics domains.
	 *
	 * @return the google analytics domains
	 */
	public List<String> getGoogleAnalyticsDomains() {
		return googleAnalyticsDomains;
	}

	/**
	 * Sets the google analytics domains.
	 *
	 * @param googleAnalyticsDomains the new google analytics domains
	 */
	public void setGoogleAnalyticsDomains(List<String> googleAnalyticsDomains) {
		this.googleAnalyticsDomains = googleAnalyticsDomains;
	}

	/**
	 * Adds the google analytics domain.
	 *
	 * @param googleAnalyticsDomain the google analytics domain
	 */
	public void addGoogleAnalyticsDomain(String googleAnalyticsDomain) {
		this.googleAnalyticsDomains = ObjectUtils.addToList(this.googleAnalyticsDomains, googleAnalyticsDomain);
	}

	/**
	 * Gets the google analytics campaign.
	 *
	 * @return the google analytics campaign
	 */
	public String getGoogleAnalyticsCampaign() {
		return googleAnalyticsCampaign;
	}

	/**
	 * Sets the google analytics campaign.
	 *
	 * @param googleAnalyticsCampaign the new google analytics campaign
	 */
	public void setGoogleAnalyticsCampaign(String googleAnalyticsCampaign) {
		this.googleAnalyticsCampaign = googleAnalyticsCampaign;
	}

	/**
	 * Gets the recipient meta data.
	 *
	 * @return the recipient meta data
	 */
	public List<RecipientMetadata> getRecipientMetaData() {
		return recipientMetaData;
	}

	/**
	 * Sets the recipient meta data.
	 *
	 * @param recipientMetaData the new recipient meta data
	 */
	public void setRecipientMetaData(List<RecipientMetadata> recipientMetaData) {
		this.recipientMetaData = recipientMetaData;
	}

	/**
	 * Adds the recipient meta data.
	 *
	 * @param recipientMetaData the recipient meta data
	 */
	public void addRecipientMetaData(RecipientMetadata recipientMetaData) {
		this.recipientMetaData = ObjectUtils.addToList(this.recipientMetaData, recipientMetaData);
	}
}
