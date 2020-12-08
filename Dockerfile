FROM clojure:lein

WORKDIR /home/functional-template
COPY . /home/functional-template

CMD ["lein", "test"]

