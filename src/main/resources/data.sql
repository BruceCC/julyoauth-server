--oauth_client_details--
INSERT INTO oauth_client_details
	(client_id, client_secret, scope, authorized_grant_types,
	web_server_redirect_uri, authorities, access_token_validity,
	refresh_token_validity, additional_information, autoapprove)
VALUES
	('10000', 'P10000', 'person,enterprise,admin',
	'password,authorization_code,refresh_token,client_credentials', null, null, 36000, 36000, null, true);

INSERT INTO oauth_client_details
	(client_id, client_secret, scope, authorized_grant_types,
	web_server_redirect_uri, authorities, access_token_validity,
	refresh_token_validity, additional_information, autoapprove)
VALUES
	('10001', 'P10001', 'person',
	'password,client_credentials', null, null, 36000, 36000, null, false);

INSERT INTO oauth_client_details
	(client_id, client_secret, scope, authorized_grant_types,
	web_server_redirect_uri, authorities, access_token_validity,
	refresh_token_validity, additional_information, autoapprove)
VALUES
	('10002', 'P10002', 'enterprise',
	'password,client_credentials', null, null, 36000, 36000, null, false);

INSERT INTO oauth_client_details
	(client_id, client_secret, scope, authorized_grant_types,
	web_server_redirect_uri, authorities, access_token_validity,
	refresh_token_validity, additional_information, autoapprove)
VALUES
	('10003', 'P10003', 'person,enterprise',
	'password,authorization_code,refresh_token,client_credentials', null, null, 36000, 36000, null, false);

INSERT INTO oauth_client_details
	(client_id, client_secret, scope, authorized_grant_types,
	web_server_redirect_uri, authorities, access_token_validity,
	refresh_token_validity, additional_information, autoapprove)
VALUES
	('10004', 'P10004', 'person,enterprise',
	'implicit', null, null, 36000, 36000, null, false);

INSERT INTO oauth_client_details
	(client_id, client_secret, scope, authorized_grant_types,
	web_server_redirect_uri, authorities, access_token_validity,
	refresh_token_validity, additional_information, autoapprove)
VALUES
	('10005', 'P10005', 'person,enterprise',
	'authorization_code,refresh_token,client_credentials', null, null, 36000, 36000, null, true);

