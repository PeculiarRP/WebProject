FROM ubuntu:latest
LABEL authors="navip"

ENTRYPOINT ["top", "-b"]