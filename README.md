# AreaDoQuadrado

Comandos Utilizados

Aqui está a explicação resumida de cada comando para integrar diretórios locais com remoto no GitHub.

echo "# DiferencaIdade" >> README.md
→ Cria um arquivo README.md com o texto # DiferencaIdade (um título em Markdown).

git init
→ Inicializa um repositório Git na pasta atual (cria a estrutura oculta .git/).

git add README.md
→ Adiciona o arquivo README.md ao Staging Area (preparação para o commit).

git commit -m "first commit"
→ Cria um commit com as alterações adicionadas, usando a mensagem "first commit".

git branch -M main
→ Renomeia a branch padrão (geralmente master) para main (convenção moderna).

git remote add origin https://github.com/Walterdev1k/DiferencaIdade.git
→ Vincula o repositório local a um repositório remoto (GitHub) chamado origin.

git push -u origin main
→ Envia (push) os commits locais para o repositório remoto (origin), na branch main.
→ O -u define origin/main como upstream (rastreamento automático).

Resumo Geral:
Esses comandos criam um novo projeto Git, adicionam um README.md, 
fazem o primeiro commit e o enviam para um repositório remoto no GitHub.

**************************************************************************************

walter-domiciano:~/development/Exercicios/AreaDoQuadrado(git:main)$ echo "# AreaDoQuadrado" >> README.md
walter-domiciano:~/development/Exercicios/AreaDoQuadrado(git:main)$ git init
Reinitialized existing Git repository in /home/walter-domiciano/development/Exercicios/AreaDoQuadrado/.git/
walter-domiciano:~/development/Exercicios/AreaDoQuadrado(git:main)$ git add README.md
walter-domiciano:~/development/Exercicios/AreaDoQuadrado(git:main)$ git commit -m "first commit"
[main e9f5dd4] first commit
 1 file changed, 2 insertions(+)
 create mode 100644 README.md
walter-domiciano:~/development/Exercicios/AreaDoQuadrado(git:main)$ git branch -M main
walter-domiciano:~/development/Exercicios/AreaDoQuadrado(git:main)$ git remote add origin https://github.com/Walterdev1k/AreaDoQuadrado.git
error: remote origin already exists.
walter-domiciano:~/development/Exercicios/AreaDoQuadrado(git:main)$ git remote remove origin
walter-domiciano:~/development/Exercicios/AreaDoQuadrado(git:main)$ git remote add origin https://github.com/Walterdev1k/AreaDoQuadrado.git
walter-domiciano:~/development/Exercicios/AreaDoQuadrado(git:main)$ git push -u origin main --force
Enumerating objects: 15, done.
Counting objects: 100% (15/15), done.
Delta compression using up to 4 threads
Compressing objects: 100% (14/14), done.
Writing objects: 100% (15/15), 2.80 KiB | 954.00 KiB/s, done.
Total 15 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), done.
To https://github.com/Walterdev1k/AreaDoQuadrado.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.
