from langchain_ollama import ChatOllama
# py -m pip install langchain-ollama

grammar = ""
with open("D:\\utwente.svn\\github fatvdbergdotus\\bilang\\bilang\\eclipse\\org.xtext.example.bilang\\src\\org\\xtext\\example\\bilang\\bilang.xtext", "r") as file:
    grammar = file.read()

ollama_client = ChatOllama(model='llama3:latest', keep_alive="30m")
prompt ='stuur een email aan f@vdberg.us met bericht Hoi, hoe gaat het ermee?'
output= ollama_client.invoke("only return the entire, best-matching bilang instance for the entire prompt that adheres to the bilang grammar"
                             + "\n\nbilang grammar:\n" 
                             + grammar
                             + "\n\nprompt:\n" 
                             + prompt)
print(output.content)



'''
> CHATGPT prompt:
return only the exact matching bilang instance that adheres to the bilang grammar
bilang grammar:
https://raw.githubusercontent.com/fatvdbergdotus/bilang/refs/heads/main/eclipse/org.xtext.example.bilang/src/org/xtext/example/bilang/Bilang.xtext
prompt:
stuur een email aan f@vdberg.us en freek@vdberg.us met Welkom, haal factuur 1234 en 5678 op, en stuur deze ook naar beide personen

> CHATGPT response:
compound process 
task send an email to person with email f@vdberg.us and person with email freek@vdberg.us with content message Welkom 
task retrieve document invoice with code 1234 
task retrieve document invoice with code 5678 
task send an email to person with email f@vdberg.us and person with email freek@vdberg.us with content document invoice with code 1234 
task send an email to person with email f@vdberg.us and person with email freek@vdberg.us with content document invoice with code 5678
'''