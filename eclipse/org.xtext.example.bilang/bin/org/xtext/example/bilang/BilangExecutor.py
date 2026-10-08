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
    task add person with alias Freek and person with phone number +3112345678 and person with first name Freek and last name "van den Berg" 
    task add person with alias Jan and person with phone number +31987654321 and person with first name Jan and last name "Jansen" 
    task phone call person with phone number +3112345678 
    task phone call person with phone number +31987654321 
    task retrieve document invoice with code 123 
    task retrieve document invoice with code 657 
    task send an email to person with phone number +3112345678 and person with phone number +31987654321 with content invoice with code 123 
    task send an email to person with phone number +3112345678 and person with phone number +31987654321 with content invoice with code 657
'''