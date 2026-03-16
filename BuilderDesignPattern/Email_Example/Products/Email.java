package BuilderDesignPattern.Email_Example.Products;

import BuilderDesignPattern.Email_Example.ProductTypes.EmailPriorityType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Email {

	private final String to;
	private final String subject;
	private final List<String> cc;
	private final List<String> bcc;
	private final String body;
	private final EmailPriorityType priorityType;
	private final String attachment;

	public Email(Builder builder) {
		this.to = builder.to;
		this.subject = builder.subject;
		this.cc = builder.cc;
		this.bcc = builder.bcc;
		this.body = builder.body;
		this.priorityType = builder.priorityType;
		this.attachment = builder.attachment;
	}

	public static class Builder {
		private final String to;
		private final String subject;
		private List<String> cc = new ArrayList<String>();
		private List<String> bcc = new ArrayList<String>();
		private String body = "";
		private String attachment = "";
		private EmailPriorityType priorityType = EmailPriorityType.NORMAL;

		public Builder(String recipient, String subject) {
			this.to = recipient;
			this.subject = subject;
		}

		public Builder addCCRecipient(String... ccRecipients) {
			this.cc.addAll(Arrays.asList(ccRecipients));
			return this;
		}

		public Builder addBCCRecipients(String... bccRecipients) {
			this.bcc.addAll(Arrays.asList(bccRecipients));
			return this;
		}

		public Builder setBody(String bodyText){
			this.body = bodyText;
			return this;
		}

		public Builder addAttachment(String location) {
			this.attachment = location;
			return this;
		}

		public Builder changePriority(EmailPriorityType priority) {
			this.priorityType = priority;
			return this;
		}

		public Email build() {
			return new Email(this);
		}
	}

	@Override
	public String toString() {
		StringBuilder emailString = new StringBuilder();

		emailString.append("To: ").append(to).append("\n");

		if (cc != null && !cc.isEmpty()) {
			emailString.append("Cc: ").append(String.join(", ", cc)).append("\n");
		}
		if (bcc != null && !bcc.isEmpty()) {
			emailString.append("Bcc: ").append(String.join(", ", bcc)).append("\n");
		}

		emailString.append("Subject: ").append(subject).append("\n");
		emailString.append("Priority: ").append(priorityType).append("\n");

		if (attachment != null && !attachment.isEmpty()) {
			emailString.append("Attachment: ").append(attachment).append("\n");
		}

		emailString.append(body != null ? body : "");
		emailString.append("\n--------------------------------------------------");
		emailString.append("\n--------------------------------------------------");

		return emailString.toString();
	}
}
