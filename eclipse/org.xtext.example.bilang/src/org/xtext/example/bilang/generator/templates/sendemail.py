# static code
import smtplib
from email.message import EmailMessage
import mimetypes
from pathlib import Path
from email.message import EmailMessage

def add_attachment(msg, file_path):
    path = Path(file_path)

    if not path.is_file():
        print(f"File not found: {path}")
        continue

    mime_type, _ = mimetypes.guess_type(path.name)

    if mime_type:
        main_type, sub_type = mime_type.split("/", 1)
    else:
        main_type, sub_type = "application", "octet-stream"

    with path.open("rb") as file:
        msg.add_attachment(file.read(), maintype=main_type, subtype=sub_type, filename=path.name)
        
    return msg

def send_email(recipient, content, attachments=[])
	msg = EmailMessage()
	msg["From"] = sender
	msg["To"] = recipient
	msg["Subject"] = "Test email"
	msg.set_content(content)
	
	# Add attachments
	for file_path in attachments:
		msg = add_attachment(msg, file_path)
	
	with smtplib.SMTP("in-v3.mailjet.com", 587) as smtp:
	    smtp.starttls()
	    smtp.login("f@vdberg.us", "password!")
	    smtp.send_message(msg)