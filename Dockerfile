# Java 17 + Maven の公式イメージ
FROM maven:3.9.6-eclipse-temurin-17

# 作業ディレクトリ
WORKDIR /workspace

# ホスト上のコードをマウントして使う想定なのでCOPYは省略

CMD ["bash"]