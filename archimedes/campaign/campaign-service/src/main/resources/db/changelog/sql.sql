create table campaign(
	-- NOT NULL & INT can't be here
	id SERIAL PRIMARY KEY,
	description VARCHAR(255) NOT NULL,
	end_date DATE,
	is_active BOOLEAN NOT NULL,
	start_date DATE,
	timestamp DATE,
	title VARCHAR(255) NOT NULL
);
insert into campaign(
		id,
		description,
		end_date,
		is_active,
		start_date,
		timestamp,
		title
	)
VALUES (
		1,
		'testDescription',
		DATE('2022-03-15'),
		FALSE,
		DATE('2022-03-14'),
		DATE('2022-03-14'),
		'testTitle'
	);