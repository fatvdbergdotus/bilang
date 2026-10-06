# static code
import smtplib
from email.message import EmailMessage

def send_email(recipient,content)
	msg = EmailMessage()
	msg["From"] = sender
	msg["To"] = recipient
	msg["Subject"] = "Test email"
	msg.set_content(content)
	
	with smtplib.SMTP("in-v3.mailjet.com", 587) as smtp:
	    smtp.starttls()
	    smtp.login("f@vdberg.us", "act12481!")
	    smtp.send_message(msg)
# dynamically added
sendemail(f@vdberg.us, hello world)
sendemail(freek@vdberg.us, hello world)
