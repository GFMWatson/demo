DROP TABLE IF EXISTS jokes;
CREATE TABLE jokes (
  id         INT          NOT NULL AUTO_INCREMENT,
  content    VARCHAR(150) NOT NULL,
  punchline  VARCHAR(150) NOT NULL,
  PRIMARY KEY (id)
);

DROP TABLE IF EXISTS dogs;
CREATE TABLE dogs (
  id          INT           NOT NULL AUTO_INCREMENT,
  rows        INT           NOT NULL,
  name        VARCHAR(50)   NOT NULL,
  human       VARCHAR(50)   NOT NULL,
  age         INT           NOT NULL,
  PRIMARY KEY (id)
);
