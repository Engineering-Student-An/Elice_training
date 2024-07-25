select max(price) as '최댓값', min(price) as '최솟값'
from books where publication_year between 2001 and 2003;
