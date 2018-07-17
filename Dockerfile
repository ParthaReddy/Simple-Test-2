USER myuser
FROM scratch
ADD SimpleTest-2 /var/www/html/
RUN rm /var/www/html/index.html

