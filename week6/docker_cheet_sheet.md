# IBM Academy - Docker cheet-sheet
Il seguente cheet-sheet è stato creato per il *"Modulo 6 - Security and Microservices"* della Java Academy di IBM, e si propone di raccogliere una serie di comandi utili per la creazine e la gestione di un container. I seguenti comandi se bene scritti per docker sono validi anche per podman, basta sostituire podman al posto di docker.

### 1 - Creazione Immagini

#### 1.1 - ``build``
Il comando ``build`` di docker serve a costruire l'immagine del container:
```
docker build -t <tag-immagine>:<versione> <docker-project>
```
- l'opzione ``-t <tag-immagine>:<versione>`` permette di attribuire un tag e una versione all'immagine docker che stiamo creando nel registro delle immagini locali. Se non viene specificata la versione viene messo di default latest.
- il parametro ``<docker-project>`` specifica la cartella principale di un progetto contenente un ``Dockerfile`` o ``Containerfile``.

### 2 - Gestione immagini

#### 2.1 - ``image ls``
Il comando ``image`` in combinazione con ``ls``  visualizza le immagini attualmente presenti nel repo locale di docker:
```
docker image ls
```
in alternativa puoi ottrenere lo stesso risultato con il comando ```docker images```.

#### 2.2 - ``image rm``
Il comando ``image`` in combinazione con ``rm`` elimina una immagine:
```
docker image rm <tag-immagine>:<versione>
```
- il parametro ``<tag-immagine>:<versione>`` sono ovviamente il tag e il nome della versione dell'immagine da eliminare.

#### 2.4 - ``image prune``
Il comando ``image`` in combinazione con ``prune`` elimina tutte le immagini non legate a container creati:
```
docker image prune
```

### 3 Creazione Container

#### 3.1 - ``run``
Il comando ``run`` di docker serve a creare ed avviare un container partendo da una immagine:
```
docker run -d --name <nome-container> -p <porta-host>:<porta-container> -e <env-variable-name>=<env-variable-value> <tag-immagine>
```
- l'opzione ``-d`` fa si che una volta avviato il container il comando ``run`` ritorni il prompt
- l'opzione ``--name <nome-container>`` attribuisce un nome al container. 
- l'opzione ``-p <porta-host>:<porta-container>`` mappa una porta dell'host su cui è avviato docker ad una porta del container che si sta cercando di avviare.
- l'opzione ``-e <env-variable-name>=<env-variable-value>`` setta una specifica variabile d'ambiente per il container che si sta per instanziare.

#### 3.2 - ``container create``
Il comando ``container`` di docker in combinazione con ``create`` serve a creare un container partendo da una immagine:
```
docker container create --name <nome-container> -p <porta-host>:<porta-container> -e <env-variable-name>=<env-variable-value> <tag-immagine>
```
- l'opzione ``--name <nome-container>`` attribuisce un nome al container. 
- l'opzione ``-p <porta-host>:<porta-container>`` mappa una porta dell'host su cui è avviato docker ad una porta del container che si sta cercando di avviare.
- l'opzione ``-e <env-variable-name>=<env-variable-value>`` setta una specifica variabile d'ambiente per il container che si sta per instanziare.

#### 4 - Gestione container

#### 4.3 - ``start``
Il comando container ``start`` permette di iniziare l'esecuzione un container.
```
docker start <nome-container>
```
- il parametro ```<nome-container>``` indica il nome del container su cui eseguire l'operazione.

#### 4.4 - ``stop``
Il comando container ``stop`` permette di stoppare l'esecuzione di un container.
```
docker stop <nome-container>
```
- il parametro ```<nome-container>``` indica il nome del container su cui eseguire l'operazione.

#### 4.5 ``container ls``
Il comando container ``container`` in combinazione con ``rm`` permette di rimuovere un container.
```
docker container ls -a
```
- l'opzione ``-a`` permette di visualizzare anche i container non in esecuzione.

#### 4.6 ``container rm``
Il comando container ``container`` in combinazione con ``rm`` permette di rimuovere un container.
```
docker container rm <nome-container>
```
- il parametro ```<nome-container>``` indica il nome del container su cui eseguire l'operazione.

## Fonti
1. [Documentazione Docker](https://docs.docker.com/engine/reference/commandline/cli/)
2. [Documentazione Podman](http://johnmacfarlane.net/pandoc/README.html#pandocs-markdown)
