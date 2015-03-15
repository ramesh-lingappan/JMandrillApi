package com.jmandrillapi.model;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jmandrillapi.utils.ObjectUtils;

public class MandrillMessage {

	private String html, text, subject, subaccount;

	private List<Recipient> to;

	private List<String> tags;

	private Map<String, String> headers, metadata;

	private boolean important, merge;

	private List<MessageAttachment> attachments, images;

	@JsonProperty("from_email")
	private String fromEmail;

	@JsonProperty("from_name")
	private String fromName;

	@JsonProperty("track_opens")
	private boolean trackOpens;

	@JsonProperty("track_clicks")
	private boolean trackClicks;

	@JsonProperty("auto_text")
	private boolean autoText;

	@JsonProperty("auto_html")
	private boolean autoHtml;

	@JsonProperty("inline_css")
	private boolean inlineCss;

	@JsonProperty("url_strip_qs")
	private boolean urlStripQs;

	@JsonProperty("preserve_recipients")
	private boolean preserveRecipients;

	@JsonProperty("view_content_link")
	private boolean viewContentLink;

	@JsonProperty("bcc_address")
	private String bccAddress;

	@JsonProperty("tracking_domain")
	private String trackingDomain;

	@JsonProperty("signing_domain")
	private String signingDomain;

	@JsonProperty("return_path_domain")
	private String returnPathDomain;

	@JsonProperty("merge_language")
	private String mergeLanguage;

	@JsonProperty("global_merge_vars")
	private List<MergeVar> globalMergeVars;

	@JsonProperty("merge_vars")
	private List<RecipientMergeVars> mergeVars;

	@JsonProperty("google_analytics_domains")
	private List<String> googleAnalyticsDomains;

	@JsonProperty("google_analytics_campaign")
	private String googleAnalyticsCampaign;

	@JsonProperty("recipient_metadata")
	private List<RecipientMetadata> recipientMetaData;

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubaccount() {
		return subaccount;
	}

	public void setSubaccount(String subaccount) {
		this.subaccount = subaccount;
	}

	public List<Recipient> getTo() {
		return to;
	}

	public void setTo(List<Recipient> to) {
		this.to = to;
	}

	public void addTo(Recipient recipient) {
		this.to = ObjectUtils.addToList(to, recipient);
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public void addTags(String tag) {
		this.tags = ObjectUtils.addToList(tags, tag);
	}

	public Map<String, String> getHeaders() {
		return headers;
	}

	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}

	public void addHeader(String key, String value) {
		this.headers = ObjectUtils.addToMap(this.headers, key, value);
	}

	public Map<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}

	public void addMetaData(String key, String value) {
		this.metadata = ObjectUtils.addToMap(this.metadata, key, value);
	}

	public boolean isImportant() {
		return important;
	}

	public void setImportant(boolean important) {
		this.important = important;
	}

	public boolean isMerge() {
		return merge;
	}

	public void setMerge(boolean merge) {
		this.merge = merge;
	}

	public List<MessageAttachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<MessageAttachment> attachments) {
		this.attachments = attachments;
	}

	public void addAttachment(MessageAttachment attachment) {
		this.attachments = ObjectUtils.addToList(this.attachments, attachment);
	}

	public List<MessageAttachment> getImages() {
		return images;
	}

	public void setImages(List<MessageAttachment> images) {
		this.images = images;
	}

	public void addImage(MessageAttachment image) {
		this.images = ObjectUtils.addToList(this.images, image);
	}

	public String getFromEmail() {
		return fromEmail;
	}

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	public String getFromName() {
		return fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public boolean isTrackOpens() {
		return trackOpens;
	}

	public void setTrackOpens(boolean trackOpens) {
		this.trackOpens = trackOpens;
	}

	public boolean isTrackClicks() {
		return trackClicks;
	}

	public void setTrackClicks(boolean trackClicks) {
		this.trackClicks = trackClicks;
	}

	public boolean isAutoText() {
		return autoText;
	}

	public void setAutoText(boolean autoText) {
		this.autoText = autoText;
	}

	public boolean isAutoHtml() {
		return autoHtml;
	}

	public void setAutoHtml(boolean autoHtml) {
		this.autoHtml = autoHtml;
	}

	public boolean isInlineCss() {
		return inlineCss;
	}

	public void setInlineCss(boolean inlineCss) {
		this.inlineCss = inlineCss;
	}

	public boolean isUrlStripQs() {
		return urlStripQs;
	}

	public void setUrlStripQs(boolean urlStripQs) {
		this.urlStripQs = urlStripQs;
	}

	public boolean isPreserveRecipients() {
		return preserveRecipients;
	}

	public void setPreserveRecipients(boolean preserveRecipients) {
		this.preserveRecipients = preserveRecipients;
	}

	public boolean isViewContentLink() {
		return viewContentLink;
	}

	public void setViewContentLink(boolean viewContentLink) {
		this.viewContentLink = viewContentLink;
	}

	public String getBccAddress() {
		return bccAddress;
	}

	public void setBccAddress(String bccAddress) {
		this.bccAddress = bccAddress;
	}

	public String getTrackingDomain() {
		return trackingDomain;
	}

	public void setTrackingDomain(String trackingDomain) {
		this.trackingDomain = trackingDomain;
	}

	public String getSigningDomain() {
		return signingDomain;
	}

	public void setSigningDomain(String signingDomain) {
		this.signingDomain = signingDomain;
	}

	public String getReturnPathDomain() {
		return returnPathDomain;
	}

	public void setReturnPathDomain(String returnPathDomain) {
		this.returnPathDomain = returnPathDomain;
	}

	public String getMergeLanguage() {
		return mergeLanguage;
	}

	public void setMergeLanguage(String mergeLanguage) {
		this.mergeLanguage = mergeLanguage;
	}

	public List<MergeVar> getGlobalMergeVars() {
		return globalMergeVars;
	}

	public void setGlobalMergeVars(List<MergeVar> globalMergeVars) {
		this.globalMergeVars = globalMergeVars;
	}

	public void addGlobalMergeVar(MergeVar var) {
		this.globalMergeVars = ObjectUtils.addToList(this.globalMergeVars, var);
	}

	public List<RecipientMergeVars> getMergeVars() {
		return mergeVars;
	}

	public void setMergeVars(List<RecipientMergeVars> mergeVars) {
		this.mergeVars = mergeVars;
	}

	public void addMergeVar(RecipientMergeVars mergeVar) {
		this.mergeVars = ObjectUtils.addToList(this.mergeVars, mergeVar);
	}

	public List<String> getGoogleAnalyticsDomains() {
		return googleAnalyticsDomains;
	}

	public void setGoogleAnalyticsDomains(List<String> googleAnalyticsDomains) {
		this.googleAnalyticsDomains = googleAnalyticsDomains;
	}

	public void addGoogleAnalyticsDomain(String googleAnalyticsDomain) {
		this.googleAnalyticsDomains = ObjectUtils.addToList(this.googleAnalyticsDomains, googleAnalyticsDomain);
	}

	public String getGoogleAnalyticsCampaign() {
		return googleAnalyticsCampaign;
	}

	public void setGoogleAnalyticsCampaign(String googleAnalyticsCampaign) {
		this.googleAnalyticsCampaign = googleAnalyticsCampaign;
	}

	public List<RecipientMetadata> getRecipientMetaData() {
		return recipientMetaData;
	}

	public void setRecipientMetaData(List<RecipientMetadata> recipientMetaData) {
		this.recipientMetaData = recipientMetaData;
	}

	public void addRecipientMetaData(RecipientMetadata recipientMetaData) {
		this.recipientMetaData = ObjectUtils.addToList(this.recipientMetaData, recipientMetaData);
	}
}
