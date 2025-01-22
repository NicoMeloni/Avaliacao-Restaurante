CREATE TABLE IF NOT EXISTS usuario(
    idUsuario  INTEGER PRIMARY KEY AUTOINCREMENT , 
    nome TEXT UNIQUE,
    senha TEXT NOT NULL,
    email TEXT,
    dataCadastro DATETIME DEFAULT CURRENT_TIMESTAMP,
    documento TEXT,
    tipoDocumento TEXT CHECK (tipoDocumento IN ('cpf', 'cnpj'))
);