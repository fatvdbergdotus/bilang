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
TASK:
Translate the user's natural-language request into Bilang.

GRAMMAR:
https://raw.githubusercontent.com/fatvdbergdotus/bilang/d5794c40e137b89d79754efb13b0d83ec80322f7/eclipse/org.xtext.example.bilang/src/org/xtext/example/bilang/Bilang.xtext

SEMANTICS:
Preserve the user's intended actions, recipients and parameters.

CONSTRAINTS:

- Return exactly one Bilang instance.
- It must exactly conform to the grammar, parseable word by word.
- Do not explain the result.
- Do not add Markdown.
- Do not invent information.

OUTPUT:
Return only the Bilang instance.

USER'S NATURAL LANGUAGE:
Voeg persoon met telefoonnummer +3112345678 en naam Freek van den Berg toe en persoon met telefoonummer +31987654321 en naam Jan Jansen, 
bel beide personen, download factuur 123 and 657 en email deze naar beide personen

> CHATGPT response:
compound process 
task send an email to person with email f@vdberg.us and person with email freek@vdberg.us with content message Welkom 
task retrieve document invoice with code 1234 
task retrieve document invoice with code 5678 
task send an email to person with email f@vdberg.us and person with email freek@vdberg.us with content document invoice with code 1234 
task send an email to person with email f@vdberg.us and person with email freek@vdberg.us with content document invoice with code 5678
'''