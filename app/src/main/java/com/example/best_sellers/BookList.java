package com.example.best_sellers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookList extends ArrayList<Book> {
    public static final BookList instance = BookList.getInstance();

    private BookList(List<Book> list) {
        super(list);
    }

    private static BookList getInstance() {
        Book[] books = {
                new Book(R.drawable.book_1,
                        "O Homem Mais Rico da Babilônia",
                        "George S. Clason",
                        "Harpercollins Brasil",
                        2,
                        45,
                        "O Homem Mais Rico da Babilônia de George Clason é um best seller que já vendeu mais de 2 milhões de cópias. Ambientado na Babilônia antiga a história conta sobre Bansir um construtor de carruagens que ainda que ganhe um bom dinheiro e viva bem não consegue enriquecer para viver os luxos de alguém verdadeiramente rico. ",
                        13.88
                ),
                new Book(R.drawable.book_2,
                        "Mais Esperto que o Diabo",
                        "Napoleon Hill",
                        "Citadel",
                        5,
                        123,
                        "Neste livro, inédito no Brasil, você vai descobrir, após 75 anos de segredo, por meio dessa entrevista exclusiva que Napoleon Hill fez, quebrando o código secreto da mente do Diabo: Quem é o Diabo? Onde ele habita? Quais suas principais armas mentais? Quem são os alienados e de que forma eles ou elas se alienam? De que forma o Diabo influencia a nossa vida do dia a dia? Como a sua dominação influencia nossas atitudes? O que é o medo? Como nossos líderes religiosos e nossos professores são afetados pelo Diabo? Quais as armas que nós, seres humanos, possuímos para combater a dominação do Diabo? Qual a visão do Diabo sobre a energia sexual? Como buscar uma vida cheia de realizações, valorizando a felicidade e a liberdade? Essas perguntas e muitas outras são respondidas pelo próprio Diabo, que se autodenomina \"Sua Majestade\", de acordo com Napoleon Hill. O seu propósito, escrito com suas próprias palavras, é ajudar o ser humano a descobrir o seu real potencial, desvendando as armadilhas mentais que os homens e as mulheres deste mundo criam para si mesmos, sabotando a sua própria liberdade e o seu próprio direito de viver uma vida cheia de desafios, alegria e liberdade.",
                        8.9),
                new Book(R.drawable.book_3,
                        "O Poder do Hábito",
                        "Charles Duhigg",
                        "Objetiva",
                        4,
                        247,
                        "O Poder do Hábito: por que fazemos o que fazemos na vida e nos negócios é um livro de Charles Duhigg, ex-repórter do New York Times, publicado em Fevereiro de 2012 pela Random House. Explora a ciência por trás da criação e reforma de hábitos. O livro chegou à lista de mais vendidos do New York Times, Amazon.com e USA Today.",
                        27.9),
                new Book(R.drawable.book_4,
                        "Do Mil ao Milhão",
                        "Thiago Nigro",
                        "Harpercollins Brasil",
                        6,
                        135,
                        "Em seu primeiro livro, Thiago Nigro, criador da plataforma O Primo Rico, ensina aos leitores os três pilares para atingir a independência financeira: gastar bem, investir melhor e ganhar mais. Por meio de dados e de sua própria experiência como investidor e assessor, Nigro mostra que a riqueza é possível para todos – basta estar disposto a aprender e se dedicar.",
                        19.9),
                new Book(R.drawable.book_5,
                        "Pai Rico, Pai Pobre - Para Jovens",
                        "Robert Kiyosaki e Sharon Lechter",
                        "Alta Books",
                        10,
                        47,
                        "Você sente que a educação tradicional não tem nada a ver com a vida e que a escola não está preparando você para o mundo real? Se você respondeu \"sim\" a essas perguntas, então este livro foi feito para você! Quando criança, Robert Kiyosaki não foi um dos melhores alunos. Apesar de inteligente, ele aprendia de forma diferente daquela esperada pelos professores. Então, Robert encontrou um mentor que lhe ensinou muitas lições sobre dinheiro e investimentos — e teve tanto êxito que pôde se aposentar antes de chegar aos cinquenta anos. Pai Rico, Pai Pobre para Jovens, mais um sucesso da série de best-sellers sobre dinheiro e investimentos, não se limita a contar a impressionante história de vida do autor; ele mostra como tomar decisões hoje — e começar a pensar como os ricos.",
                        40.89),
                new Book(R.drawable.book_6,
                        "Os Segredos da Mente Milionária",
                        "T. Harv Eker",
                        "Sextante",
                        8,
                        337,
                        "Aprenda a enriquecer mudando seus conceitos sobre o dinheiro e adotando os hábitos das pessoas bem-sucedidas \"T. Harv Eker desmistifica o motivo pelo qual algumas pessoas estão destinadas à riqueza e outras a uma vida de dureza.",
                        24.9),
        };

        return new BookList(Arrays.asList(books));
    }
}
