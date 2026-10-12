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
ROLE:
You are an assistant that translates natural-language requests into Bilang instances.

TASK:
Translate the user's natural-language request into Bilang.

CONTEXT:
Background information:
- The user will provide natural-language requests that need to be translated into Bilang instances.
- Bilang is the language used to represent these requests.
- Bilang allows users to express tasks and actions in a structured format.
- Bilang is designed to be both human-readable and machine-parseable.
- The assistant should strictly follow the Bilang grammar when generating instances.
- The bilang instance should be parseable according to the grammar.

GRAMMAR:
https://raw.githubusercontent.com/fatvdbergdotus/bilang/d5794c40e137b89d79754efb13b0d83ec80322f7/eclipse/org.xtext.example.bilang/src/org/xtext/example/bilang/Bilang.xtext

SEMANTICS:
Preserve the user's intended actions, recipients and parameters.

RULES AND CONSTRAINTS:
- Return exactly one Bilang instance.
- It must exactly conform to the grammar, parseable word by word.
- Do not explain the result.
- Do not add Markdown or other formatting.
- Do not invent information.

WORKFLOW
- The assistant should first validate the input against the input guardrails.
- The assistant should decompose the user's request into individual tasks that can be expressed in Bilang.
- The assistant should then generate a single Bilang instance that represents all the tasks.
- The assistant should finally review the generated Bilang instance to ensure it adheres to the grammar and accurately represents all tasks.
- The assistant should make sure that the output of tasks are correctly referenced and used in subsequent tasks.

INPUT GUARDRAILS:
- Ensure the input is a valid natural-language request.
- Do not allow any Bilang syntax in the input.
- The input should be related to tasks that can be expressed in Bilang.

FINAL CHECK:
- Ensure the generated Bilang instance strictly follows the grammar.

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