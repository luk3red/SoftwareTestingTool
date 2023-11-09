<h1 class="code-line" data-line-start=1 data-line-end=2 ><a id="Software_Testing__Test_Smell_Tool_Validation_1"></a>Software Testing - Test Smell Tool Validation</h1>
<p class="has-line-data" data-line-start="3" data-line-end="4">In questa repository vi sono gli artefatti realizzati e utilizzati per il processo di validazoione di un sistema di learning sulla tematica dei <em>Test Smell</em>.</p>
<p class="has-line-data" data-line-start="5" data-line-end="8">Per installare l’infrastruttura server in locale è necessario clonare il seguente repository:<br>
<a href="https://github.com/DarioTin/Tesi-Server-Setup">https://github.com/DarioTin/Tesi-Server-Setup</a><br>
Dopo aver clonato il repository è necessario aprire un terminale all’interno della directory creata ed inviare all’interno del terminale <code>docker-compose up</code></p>
<p class="has-line-data" data-line-start="9" data-line-end="12">Per installare il client in locale è necessario clonare la seguente repository oppure<br>
scaricare l’ultima release dal seguente indirizzo:<br>
<a href="https://github.com/DarioTin/Tesi-Client-Setup/releases">https://github.com/DarioTin/Tesi-Client-Setup/releases</a></p>
<p class="has-line-data" data-line-start="13" data-line-end="14">Dopo aver estratto il tutto, è necessario aprire un terminale all’interno della directory creata ed inviare all’interno del terminale</p>
<p class="has-line-data" data-line-start="15" data-line-end="18"><code>npm install</code></p>
<p class="has-line-data" data-line-start="19" data-line-end="20">Al termine dell’installazione verrà installato all’interno della directory“DarioTintore-Tesi-…” l’applicativo in locale, che potrà essere avviato con la seguente procedura:</p>
<ol>
<li class="has-line-data" data-line-start="20" data-line-end="21">Aprire un terminale all’interno della directory “DarioTintore-Tesi-…”</li>
<li class="has-line-data" data-line-start="21" data-line-end="24">Eseguire il comando di avvio per l’eseguibile creato all’interno della directory<br>
<code>DarioTintore-Tesi</code></li>
</ol>
<p class="has-line-data" data-line-start="24" data-line-end="25">Impostare la seguente configurazione in <em>Github retrival</em>:</p>
<p class="has-line-data" data-line-start="26" data-line-end="28"><strong>Github Repository Url:</strong> <a href="https://github.com/luk3red/SoftwareTestingTool">https://github.com/luk3red/SoftwareTestingTool</a><br>
<strong>branch:</strong> main</p>
<p class="has-line-data" data-line-start="29" data-line-end="36">Impostare la seguente configurazione nelle impostazioni del tool:<br>
seguente configurazione:<br>
<strong>User Service URL:</strong> <a href="http://localhost:8081">http://localhost:8081</a><br>
<strong>Compiler Service URL:</strong> <a href="http://localhost:8083">http://localhost:8083</a><br>
<strong>Leader Board URL:</strong> <a href="http://localhost:8087">http://localhost:8087</a><br>
<strong>Compile Mode:</strong> Cloud<br>
<strong>Excersise Retrival:</strong> GitHub</p>
