CREATE TABLE "Fun_User"
(
  id serial NOT NULL,
  firstname character varying(30),
  lastname character varying(30),
  email character varying(40),
  password character varying(8),
  CONSTRAINT "User_Id" PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Fun_User"
  OWNER TO postgres;

-- Table: "NEW"

-- DROP TABLE "NEW";

CREATE TABLE "NEW"
(
  id integer
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "NEW"
  OWNER TO postgres;
